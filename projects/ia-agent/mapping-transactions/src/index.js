// const cv2 = require('cv2');
const tesseract = require('tesseract.js');
const tesseractAPI = require('./clients/tesseract.api')


async function extraerInfoImagen(imagen) {
  // Cargar imagen
  const text = await tesseractAPI.extractTextFromImage(imagen);

  const patterns = {
    monto: /\s*S\/\s*(\d+\.\d{2})/, // Ej: "S/. 150.00" → "150.00"
    destinatario: /Enviado a:\s+([^\n]+)\s*(\d{3}\s\d{3}\s\d{3})/, // Nombre + Teléfono
    destino: /Destino:\s+([^\n]+)/, // Billetera destino
    comision: /Comisi[oó]n:\s*(gratis|\d+\.\d{2})/i, // "gratis" o monto
    fecha: /Fecha y hora:\s+(\d{2} \w{3} \d{4} \d{2}:\d{2} [AP]M)/, // "01 MAY 2025 14:30 PM"
    codigo: /Código de operación:\s+(\d+)/ // Número de operación
  };

  console.log(text.match(patterns.comision))
  
  // Extraer datos
  return {
    monto: text.match(patterns.monto)?.[1] || "No encontrado",
    destinatario: {
      nombre: text.match(patterns.destinatario)?.[1]?.trim() || "No encontrado",
      telefono: text.match(patterns.destinatario)?.[2] || "No encontrado"
    },
    destino: text.match(patterns.destino)?.[1]?.trim() || "No encontrado",
    comision: text.match(patterns.comision)?.[0] === "gratis"
      ? "S/. 0.00"
      : text.match(patterns.comision)?.[1] || "No encontrado",
    fecha: text.match(patterns.fecha)?.[1] || "No encontrado",
    codigo: text.match(patterns.codigo)?.[1] || "No encontrado"
  };
}

// Ejemplo de uso
const imagen = 'D:\\git\\learn-courses\\projects\\ia-agent\\mapping-transactions\\WhatsApp Image 2025-04-09 at 09.24.30_ffed8864.jpg';
extraerInfoImagen(imagen).then((info) => {
  console.log(info);
});
