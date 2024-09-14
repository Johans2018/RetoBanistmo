
# RetoBanistmo

# Proyecto de Automatización de Pruebas con Serenity BDD

## Descripción

Este proyecto utiliza **Serenity BDD** con **Cucumber** para la automatización de pruebas en una aplicación web. Se emplea el patrón de diseño Screenplay .

## Tecnologías Utilizadas

- **Java 11**
- **Serenity BDD**
- **Cucumber**
- **Selenium WebDriver**
- **JUnit**
- **WebDriverManager**
- **Gradle**

## Estructura del Proyecto

- **`cucumber.runner`**: Contiene la clase `Runner` que configura el runner de Cucumber con Serenity.
- **`cucumber.stepsDefinitions`**: Incluye las definiciones de pasos para interactuar con la aplicación web y validar resultados.
- **`tasks`**: Contiene las tareas que los actores realizan en la aplicación.
- **`questions`**: Define las preguntas para validar resultados en la aplicación.
- **`ui`**: Contiene las localizaciones de los elementos en la interfaz de usuario.

## Configuración

1. **Instalar Dependencias**: Asegúrate de tener Gradle instalado. Para descargar las dependencias necesarias y construir el proyecto, ejecuta:
    ```sh
    gradle build
    ```

2. **Configuración del WebDriver**: El proyecto utiliza WebDriverManager para gestionar el driver de Chrome. La configuración se realiza automáticamente al ejecutar las pruebas.

3. **Configuración del Entorno**: Configura el archivo `serenity.conf` para ajustar las opciones del navegador y otras configuraciones específicas. Asegúrate de definir las URL y otros parámetros necesarios para tu entorno de pruebas.

## Ejecución de Pruebas

Para ejecutar las pruebas, utiliza el siguiente comando de Gradle:

```sh
gradle clean test
