from pydub import AudioSegment

# Intentar cargar el archivo directamente como audio
video_audio = AudioSegment.from_file(video_path)
audio_only_path = "/mnt/data/audio_only.wav"
video_audio.export(audio_only_path, format="wav")

audio_only_path  # Devolver la ruta del archivo de audio procesado como WAV
