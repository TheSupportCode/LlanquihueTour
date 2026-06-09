
![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)

# 🗺️ LlanquihueTour – Sistema de Gestión de Empleados

## 👤 Autor del proyecto

- **Nombre completo:** [Nicolás Valdés Rojas]
- **Sección:** [001A]
- **Carrera:** Analista Programador Computacional
- **Sede:** [Online]

---

## 📘 Descripción general del sistema

Este proyecto corresponde a la asignatura *Desarrollo Orientado a Objetos I* de Duoc UC. Se trata de un sistema desarrollado en **Java** que modela y gestiona la información de personas y empleados de la empresa turística **LlanquihueTour**, aplicando principios de encapsulamiento, composición y herencia.

El sistema permite representar entidades del mundo real, como personas con su dirección y empleados con sus datos laborales, mediante una estructura de clases organizada en paquetes, ejecutable desde el IDE o consola.

---

## 🧱 Estructura del proyecto

```
📁 src/
├── app/
│   └── Main.java          # Clase principal. Punto de entrada del programa.
└── model/
    ├── Persona.java        # Clase base con atributos comunes (rut, nombre, direccion)
    ├── Empleado.java       # Extiende Persona. Agrega cargi laboral del empleado.
    └── Direccion.java      # Clase de composición, con los datos de dirección.
```

### Descripción de las clases

| Clase | Paquete | Descripción |
|---|---|---|
| `Main` | `app` | Arranca el programa, instancia objetos y muestra resultados en consola. |
| `Persona` | `model` | Clase base que modela a una persona natural con sus atributos principales. |
| `Empleado` | `model` | Hereda de `Persona` y añade el atributo "cargo" de un trabajador. |
| `Direccion` | `model` | Clase auxiliar que encapsula los datos de dirección (calle, número, ciudad). Usada por composición. |

---

## ⚙️ Instrucciones para compilar y ejecutar

### Requisitos previos

- **Java JDK 11** o superior instalado.
- **IntelliJ IDEA** (recomendado) u otro IDE compatible con Java.
- Git instalado (opcional, para clonar el repositorio).

### Pasos

**1. Clonar el repositorio**

```bash
git clone https://github.com/TheSupportCode/LlanquihueTour.git
```

**2. Abrir el proyecto**

Abre IntelliJ IDEA → `File` → `Open` → selecciona la carpeta del proyecto.

**3. Compilar**

IntelliJ compila automáticamente al abrir el proyecto. Si prefieres hacerlo desde terminal, ubícate en la raíz del proyecto y ejecuta:

```bash
javac -d out src/app/Main.java src/model/Persona.java src/model/Empleado.java src/model/Direccion.java
```

**4. Ejecutar la clase Main**

Desde IntelliJ: haz clic derecho sobre `Main.java` → `Run 'Main'`.

Desde terminal:

```bash
java -cp out app.Main
```

---

**Repositorio GitHub:** [https://github.com/TheSupportCode/LlanquihueTour](https://github.com/TheSupportCode/LlanquihueTour)
**Fecha de entrega:** [DD/MM/2025]

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Desarrollo Orientado a Objetos I
