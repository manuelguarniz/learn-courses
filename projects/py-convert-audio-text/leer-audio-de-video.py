import whisper

# Load the Whisper model
model = whisper.load_model("base")

audio_path = "/Users/manuelguarniz/Library/CloudStorage/OneDrive-UniversidadTecnologicadelPeru/02. 2025-01/08. ingles-III/semana 4.0/prueba_ZKLJWT.mp4";

# Transcribe the audio from the uploaded video file
result = model.transcribe(audio_path)

# Show the detected language and transcription
detected_language = result["language"]
transcription = result["text"]
print(detected_language)
print(transcription)

# conda create -n pythonlabs python=3.8
# conda activate pythonlabs
# conda install pip
# conda deactivate

# transcription[:500]  # Displaying only the first 500 characters for preview


# python -m venv whisper-env
# source whisper-env/bin/activate  # En Linux/macOS
# whisper-env\Scripts\activate     # En Windows

# pip install -U openai-whisper

# PARA todos menos MACOS M1
# pip install torch torchvision torchaudio
# PARA MACOS M1
# pip install torch torchvision torchaudio --extra-index-url https://download.pytorch.org/whl/cpu


# INSTALAR UNE HERRAMIENTA PARA TRABAJAR CON AUDIOS:
# brew install ffmpeg
# EJEMPLO PARA CONVERTIR UN AUDIO EN UN FORMATO QUE ENTIENDE WHISPER
# ffmpeg -i video.mp4 -vn -acodec pcm_s16le -ar 16000 -ac 1 audio.wav

# CONVERTIR DE MP4 A MP3
# ffmpeg -i video.mp4 -q:a 0 -map a output.mp3

# EXTRAER MINIATURAS DE UN VIDEO
# ffmpeg -ss 00:00:05 -i video.mp4 -frames:v 1 -q:v 2 thumbnail.jpg
# EXTRAER UNA IMAGEN POR SEGUNDO DURANTE TODO EL VIDEO
# ffmpeg -i video.mp4 -vf fps=1 miniaturas/frame_%04d.jpg


# Hacer streaming en vivo (por ejemplo, a YouTube Live o Facebook Live)
# ffmpeg -re -i video.mp4 -c:v libx264 -preset veryfast -maxrate 3000k -bufsize 6000k -c:a aac -b:a 128k -f flv rtmp://a.rtmp.youtube.com/live2/CLAVE_DE_STREAM
# -re: reproduce en tiempo real (importante para streaming).
# -f flv: formato requerido por la mayoría de plataformas de streaming.
# Compatible con: YouTube, Facebook, Twitch, etc.
# video.mp4: es un video local que ya tienes en tu computadora.
# -re: reproduce el video a velocidad real, no acelerado.
# -f flv: formato compatible con las plataformas de streaming.
# rtmp://...: es la URL del servidor de transmisión de YouTube.
# CLAVE_DE_STREAM: es tu clave secreta de transmisión que te da YouTube cuando creas un evento en vivo.
# Entonces... aunque el video ya esté grabado, FFmpeg lo “emite” como si lo estuvieras mostrando en vivo.

#  BONUS: convertir .wav a .mp3
# ffmpeg -i audio.wav audio.mp3
