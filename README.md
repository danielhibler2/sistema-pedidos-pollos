# Sistema de Pedidos - Pollos El Buen Sabor

## Descripción

Este proyecto consiste en el desarrollo de un sistema para la gestión de pedidos de un negocio local. La solución fue implementada en Java utilizando IntelliJ IDEA, permitiendo registrar y consultar pedidos mediante una interfaz de consola.

El sistema busca mejorar la organización y reducir errores en el proceso de toma de pedidos.

---

## Problema identificado

El negocio gestionaba pedidos de forma manual mediante aplicaciones de mensajería (como WhatsApp), lo cual generaba:

- Pérdida de información  
- Errores en pedidos  
- Falta de organización  
- Dificultad para dar seguimiento a órdenes  

---

## Solución

Se desarrolló un sistema en Java que permite:

- Registrar pedidos (cliente y producto)  
- Almacenar pedidos en memoria  
- Consultar pedidos registrados  

Esto permite estructurar la información y simular un flujo de gestión más organizado.

---

## Arquitectura

El sistema está basado en una estructura orientada a objetos:


src/
└── com/pedidos/
├── Main.java
├── Pedido.java
└── SistemaPedidos.java


### Componentes:

- **Main.java**  
  Controla la interacción con el usuario mediante consola.

- **Pedido.java**  
  Representa la estructura de un pedido (cliente y producto).

- **SistemaPedidos.java**  
  Gestiona la lógica del sistema (agregar y mostrar pedidos).

---

## ⚙️ Requerimientos

- Java JDK 8 o superior  
- IntelliJ IDEA (o cualquier IDE compatible con Java)  
- Git (opcional, para control de versiones)  

---

## Instalación

1. Clonar el repositorio:


git clone https://github.com/danielhibler2/sistema-pedidos-pollos.git


2. Abrir el proyecto en IntelliJ IDEA

3. Ubicar la carpeta `src`

4. Ejecutar la clase `Main.java`

---

## Ejecución

Al ejecutar el programa, se mostrará el siguiente menú:


--- SISTEMA DE PEDIDOS ---

Agregar pedido
Ver pedidos
Salir

### Flujo de uso:

1. Seleccionar opción 1 para agregar un pedido  
2. Ingresar nombre del cliente  
3. Ingresar producto  
4. Seleccionar opción 2 para visualizar pedidos  

---

## Configuración

No requiere configuración adicional.  
El sistema funciona directamente desde consola.

---

## Uso

### Usuario final

Puede:
- Registrar pedidos  
- Consultar pedidos  

### Administrador

Puede:
- Supervisar el flujo de pedidos  
- Validar información registrada  

---

## Contribución

Para contribuir al proyecto:

1. Clonar el repositorio  
2. Crear una nueva rama:

git checkout -b nueva-funcionalidad

3. Realizar cambios  
4. Hacer commit:

git commit -m "Descripción del cambio"

5. Subir cambios:

git push origin nueva-funcionalidad

6. Crear Pull Request en GitHub  

---

## Roadmap (Mejoras futuras)

- Integración con base de datos  
- Interfaz gráfica  
- Implementación web  
- Gestión de usuarios  
- Integración con plataformas externas  

---

## Producto

- Sistema funcional en Java  
- Código disponible en GitHub  
- Demostración mediante ejecución en consola  

---

## Tecnologías utilizadas

- Java  
- IntelliJ IDEA  
- GitHub  

---

## Licencia

Proyecto académico desarrollado con fines educativos.
