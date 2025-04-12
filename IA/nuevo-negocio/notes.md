# Estructura

1. Bot
2. Lenguaje
3. Slot
   1. ranuras donde se define que datos el usuario debe ingresar
   2. pueden ser de 2 tipos "built in" (datos que se pueden reconocer automaticamente, fechas, ciudades, etc) o de tipo custom (personalizado, por ejemplo reconocer todos los tipos de flores para que los pueda reconocer)
4. Intent structure
   1. Initial response: Intensión que se reconoció
   2. Slot
   3. Confirmation: mensaje de confirmación
   4. Fulfillment: code hook, Fullfillment updates y respuestas basadas en Success, Failure y timeout
   5. Closing response: Después de que se cumple su intent
5. Conversation path
6. Versionado
