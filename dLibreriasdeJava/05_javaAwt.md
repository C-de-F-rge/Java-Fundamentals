# Java Awt

La librería **Abstract Window ToolKit (AWT)** es un paquete de Java que
permite proporcionar componentes para crear Interfaces Gráficas de 
**GUI** a comtimución veremos su aplicación:

## 1. Frame (_Crear una ventana_)
Con _Frame_ podemos crear una ventana simple
```java
import java.awt.Frame;

public class FrameExample {
    public static void main(String[] args) {
        Frame ventana = new Frame("Mi Ventana AWT");
        ventana.setSize(400, 300);  // Tamaño de la ventana
        ventana.setVisible(true);   // Hacer visible la ventana
    }
}
```

---

## 2. Button (_Crear Botones_)
Con _Button_ podemos agregar botones a la ventana
```java
import java.awt.*;
import java.awt.event.*;

public class ButtonExample {
    public static void main(String[] args) {
        Frame ventana = new Frame("Ventana con Botón");
        ventana.setSize(300, 200);
        ventana.setLayout(new FlowLayout());

        Button boton = new Button("¡Haz clic!");
        boton.addActionListener(e -> System.out.println("¡Botón presionado!"));

        ventana.add(boton);
        ventana.setVisible(true);
    }
}
```

---

## 3. TextField (_Crear Campos de Texto_)
podemos añadir campos de texto del Usuario
```java
import java.awt.*;
import java.awt.event.*;

public class TextFieldExample {
    public static void main(String[] args) {
        Frame ventana = new Frame("Entrada de Texto");
        ventana.setSize(300, 200);
        ventana.setLayout(new FlowLayout());

        TextField campoTexto = new TextField(20);
        Button boton = new Button("Mostrar Texto");

        boton.addActionListener(e -> System.out.println("Texto ingresado: " + campoTexto.getText()));

        ventana.add(campoTexto);
        ventana.add(boton);
        ventana.setVisible(true);
    }
}
```

---

## 4. Graphics (_Dibujar Figuras_)
Podemos dibujar tambien, circulos, cuadrados, lineas, etc.
```java
import java.awt.*;

public class DrawExample extends Frame {
    public DrawExample() {
        setTitle("Dibujando en AWT");
        setSize(400, 300);
        setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.drawLine(50, 50, 200, 50);   // Línea
        g.setColor(Color.BLUE);
        g.drawRect(50, 70, 100, 50);   // Rectángulo
        g.setColor(Color.GREEN);
        g.fillOval(200, 100, 50, 50);  // Círculo relleno
    }

    public static void main(String[] args) {
        new DrawExample();
    }
}
```

---

# 5. Panel (_Organizar elementos_)
Sirve para organizar elementos en la ventana como el Div en Html
```java
import java.awt.*;

public class PanelExample {
    public static void main(String[] args) {
        Frame ventana = new Frame("Ejemplo de Panel");
        ventana.setSize(300, 200);
        ventana.setLayout(new BorderLayout());

        Panel panel = new Panel();
        panel.setLayout(new FlowLayout());
        panel.add(new Button("Botón 1"));
        panel.add(new Button("Botón 2"));

        ventana.add(panel, BorderLayout.CENTER);
        ventana.setVisible(true);
    }
}
```

---

# 6. Dialog (_Ventanas Emergentes_)
Podemos crear dialogos para mostrar y pedir datos al Usuario.
```java
import java.awt.*;
import java.awt.event.*;

public class DialogExample {
    public static void main(String[] args) {
        Frame ventana = new Frame("Ventana Principal");
        ventana.setSize(300, 200);
        ventana.setLayout(new FlowLayout());

        Button boton = new Button("Abrir Diálogo");

        Dialog dialogo = new Dialog(ventana, "Diálogo", true);
        dialogo.setSize(200, 100);
        dialogo.setLayout(new FlowLayout());
        dialogo.add(new Label("Este es un mensaje"));
        Button cerrar = new Button("Cerrar");
        cerrar.addActionListener(e -> dialogo.setVisible(false));
        dialogo.add(cerrar);

        boton.addActionListener(e -> dialogo.setVisible(true));

        ventana.add(boton);
        ventana.setVisible(true);
    }
}
```