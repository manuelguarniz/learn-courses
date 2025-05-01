import speech_recognition as sr

# Usar el reconocedor de voz
recognizer = sr.Recognizer()
audio_only_path = "video.mp4"

# Cargar el archivo de audio
with sr.AudioFile(audio_only_path) as source:
    audio_data = recognizer.record(source)

# Intentar transcribir el audio
transcription_text = recognizer.recognize_google(audio_data, language="es-PE")
transcription_text
