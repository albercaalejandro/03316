/* 
 * Copyright 2019 Alejandro Alberca - alejandro.alberca.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Scanner;

/**
 *
 * @author Alejandro Alberca - alejandro.alberca.alum@iescamp.es
 */
public class Main {

    public static final Scanner SCN = new Scanner(System.in, "ISO-8859-1");

    public static void main(String[] args) {
        boolean semaforo = false;
        int media = 0;
        int mediaTotal = 0;
        for (int i = 1; i < 8; i++) {
            do {
                try {

                    System.out.printf("Dime tu peso del dia %d : ", i);
                    int peso = SCN.nextInt();
                    if (peso >= 0 && peso <= 250) {
                        System.out.printf("Tu peso del dia %d es: %d%n", i, peso);
                        semaforo = false;
                        media = media + peso;
                    } else {
                        semaforo = true;
                        System.out.println("Has cometido un error vuevle a intentarlo");
                    }
                } catch (Exception e) {
                    semaforo = true;
                    System.out.println("Error");
                } finally {
                    SCN.nextLine();
                }
            } while (semaforo);

        }
        mediaTotal = media / 7;
        System.out.println("Tu peso medio es: " + mediaTotal);

    }

}
