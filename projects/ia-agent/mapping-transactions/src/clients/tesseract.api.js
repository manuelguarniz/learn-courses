const axios = require('axios');
const FormData = require('form-data');
const fs = require('fs');

const extractTextFromImage = async (imagePath) => {
    const form = new FormData();
    form.append('image', fs.createReadStream(imagePath));

    try {
        const response = await axios.post('http://localhost:3000/ocr', form, {
            headers: form.getHeaders(),
        });
        return response.data.text;
    } catch (error) {
        console.error('Error al extraer texto:', error.message);
        return null;
    }
};

// Uso
// extractTextFromImage('./imagen.png').then(text => console.log(text));
module.exports = {
    extractTextFromImage
}