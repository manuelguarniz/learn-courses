import moviepy.editor as mp

# Cargar el archivo de video
video_path = "/mnt/data/t-9kcCZFCi8YitjX69ErSBmJv1WWpMXRk_FUGLXP.mp4"
audio_path = "/mnt/data/extracted_audio.wav"

# Extraer el audio
clip = mp.VideoFileClip(video_path)
clip.audio.write_audiofile(audio_path)

audio_path  # Devolver la ruta del archivo de audio extraído
