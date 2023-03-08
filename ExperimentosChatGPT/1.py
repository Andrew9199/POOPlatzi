# Importar la biblioteca tkinter para la interfaz gráfica
import tkinter as tk

# Crear una función que se ejecutará cuando el botón sea presionado
def sumar():
    # Obtener los valores de los cuadros de texto
    num1 = float(num1_entry.get())
    num2 = float(num2_entry.get())
    # Sumar los dos números
    resultado = num1 + num2
    # Actualizar la etiqueta del resultado
    resultado_label.config(text="El resultado es: " + str(resultado))

# Crear la ventana de la aplicación
ventana = tk.Tk()
ventana.title("Suma de dos números")

# Crear los cuadros de texto para los números
num1_entry = tk.Entry(ventana)
num1_entry.pack()
num2_entry = tk.Entry(ventana)
num2_entry.pack()

# Crear el botón para sumar los números
sumar_boton = tk.Button(ventana, text="Sumar", command=sumar)
sumar_boton.pack()

# Crear la etiqueta para mostrar el resultado
resultado_label = tk.Label(ventana)
resultado_label.pack()

# Iniciar el bucle principal de la aplicación
ventana.mainloop()