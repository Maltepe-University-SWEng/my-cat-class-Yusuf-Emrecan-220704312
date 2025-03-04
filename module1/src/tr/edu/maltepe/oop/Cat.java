package tr.edu.maltepe.oop;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class Cat {
    private String name;
    private int age;
    private String color;

    // Constructor
    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void meow() {
        System.out.println(name + " says Meow! 🐱");
        try {
            // Ses dosyasının yolu
            File soundFile = new File("C:\\Users\\yusuf\\OneDrive\\Masaüstü\\cat-meow-8-fx-306184.wav");

            // Ses dosyasını aç ve oynat
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            Thread.sleep(1000);

        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            System.out.println("Ses dosyası oynatılamadı: " + e.getMessage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    // Method to display cat info
    public void displayInfo() {
        System.out.println("Cat Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Color: " + color);
    }

}

