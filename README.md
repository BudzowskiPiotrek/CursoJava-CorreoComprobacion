Crea un programa en Java que valida la estructura de una dirección de correo electrónico utilizando solo métodos básicos deString
y sin usar métodos personalizados , arrays ni expresiones regulares . El programa debe seguir estas reglas de validación:

Formato General : La dirección debe seguir el formato básico usuario@dominio.extension.

Condiciones de longitud :
• La parte de usuario (antes de @) debe tener entre 3 y 30 caracteres.
• La parte de dominio (entre @y el último .) debe tener entre 3 y 20 caracteres.
• La extensión (parte después del último .) debe tener entre 2 y 5 caracteres.

Caracteres Permitidos :
• Usuario : Solo puede contener letras (mayúsculas o minúsculas), dígitos, puntos ( .) y guiones bajos ( _).
• Dominio : Solo puede contener letras y dígitos.
• Extensión : Solo puede contener letras.
• Posiciones de caracteres especiales :

El símbolo @ debe estar presente una sola vez y no puede estar ni al inicio ni al final del correo.
Debe existir al menos un .en la parte de dominio, después del@ y antes de la extensión.
Mensajes de Error Específicos : Si alguno de estos requisitos falla, muestra un mensaje de error específico indicando qué regla se
ha violado. Defina estos mensajes como constantes para mantener el código organizado y fácil de mantener.
