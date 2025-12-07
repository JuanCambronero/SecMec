# Sistema de Gestión Clínica (Java)

Aplicación de consola en Java que simula la gestión básica de un centro médico: creación de personal sanitario y administrativo, gestión de pacientes y registro de historial médico mediante recetas y pruebas médicas.[file:3][file:5][file:6]

## Descripción

El proyecto modela una clínica sencilla con varias entidades de dominio:
- Personas: `Persona`, `Usuario`, `PersonalSanitario`, `Medico`, `Paciente`, `Administrativo`. 
- Historial clínico: `HistorialMedico`, `EntradaHistorial`, `Receta`, `PruebaMedica`.
- Lógica de control: `ControladorPrincipal` (escenario de pruebas de la app). 
- Capa de vista por consola: `Vistas`. 

Al ejecutar el programa se crea un conjunto de datos de prueba (médico, administrativo y paciente), se asigna un médico al paciente y se añaden entradas al historial médico mediante una receta y una prueba médica, mostrando todo por consola.

## Estructura del proyecto

- `App/Main.java`: punto de entrada de la aplicación, instancia el `ControladorPrincipal` e invoca al método `iniciar()`. 
- `Controlador/ControladorPrincipal.java`: contiene la lógica de creación de usuarios de prueba, asignación de médico, creación de receta y prueba médica y volcado del historial por consola.  
- `Vista/Vistas.java`: encapsula los mensajes por consola y deja preparados menús y peticiones de datos (actualmente comentados) para interacción futura.
- `Modelo/`:
  - `Persona`, `Usuario`, `PersonalSanitario`, `Medico`, `Paciente`, `Administrativo`: jerarquía de clases que representa a los distintos tipos de personas del sistema. 
  - `EntradaHistorial`, `Receta`, `PruebaMedica`, `HistorialMedico`: gestión del historial médico del paciente, con entradas para recetas (lista de medicamentos) y pruebas médicas (tipo de prueba y resultado).


```plaintext
src/
├── App/
│   └── Main.java
├── Controlador/
│   └── ControladorPrincipal.java
├── Vista/
│   └── Vistas.java
└── Modelo/
    ├── Persona.java
    ├── Usuario.java
    ├── PersonalSanitario.java
    ├── Medico.java
    ├── Paciente.java
    ├── Administrativo.java
    ├── HistorialMedico.java
    ├── EntradaHistorial.java
    ├── Receta.java
    └── PruebaMedica.java

```

## Requisitos

- Java JDK 8 o superior.  
- Cualquier IDE compatible con proyectos Java (IntelliJ IDEA, Eclipse, NetBeans).  

No se utilizan librerías externas, solo clases estándar de Java como `java.time.LocalDate`, `java.util.ArrayList` y `java.util.Arrays`.

## Cómo ejecutar

1. Clona este repositorio:
2. Importa el proyecto en tu IDE preferido como proyecto Java, o compílalo desde consola.  
3. Asegúrate de que el paquete principal es `App` y ejecuta la clase `Main` (método `main`). 
4. Observa en la consola:
- Mensaje de inicio y creación de un médico y un administrativo de prueba.
- Creación de un paciente y asignación del médico al paciente por parte del administrativo.
- Creación de una `Receta` y una `PruebaMedica` que se agregan al `HistorialMedico` del paciente y se imprimen por pantalla.

## Salida por pantalla
- **Inicio del programa y creación de usuarios** 
 <img width="472" height="746" alt="image" src="https://github.com/user-attachments/assets/03dccd40-1309-41ce-ae35-7db4c10557bd" />

- **Asignación de medico y entradas de historia medica** 
 <img width="1088" height="536" alt="image" src="https://github.com/user-attachments/assets/6c42457d-94f9-4003-89b1-e604ba92b8ee" />




