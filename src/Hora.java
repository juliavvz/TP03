package src;

import java.util.Scanner;

public class Hora {
    private int hora;
    private int min;
    private int seg;

    public Hora() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Digite a hora (0-23): ");
                int h = Integer.parseInt(scanner.nextLine());
                
                System.out.print("Digite o minuto (0-59): ");
                int m = Integer.parseInt(scanner.nextLine());
                
                System.out.print("Digite o segundo (0-59): ");
                int s = Integer.parseInt(scanner.nextLine());
                
                setHor(h);
                setMin(m);
                setSeg(s);
                break;
                
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas números!");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage() + ". Tente novamente.");
            }
        }
        scanner.close();
    }

    public Hora(int h, int m, int s) {
        setHor(h);
        setMin(m);
        setSeg(s);
    }

    public void setHor(int h) {
        if (h >= 0 && h <= 23) {
            this.hora = h;
        } else {
            throw new IllegalArgumentException("Hora deve ser entre 0 e 23");
        }
    }

    public void setMin(int m) {
        if (m >= 0 && m <= 59) {
            this.min = m;
        } else {
            throw new IllegalArgumentException("Minuto deve ser entre 0 e 59");
        }
    }

    public void setSeg(int s) {
        if (s >= 0 && s <= 59) {
            this.seg = s;
        } else {
            throw new IllegalArgumentException("Segundo deve ser entre 0 e 59");
        }
    }

    public void setHor() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Digite a nova hora (0-23): ");
                int h = Integer.parseInt(scanner.nextLine());
                setHor(h);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas números!");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage() + ". Tente novamente.");
            }
        }
        scanner.close(); 
    }

    public void setMin() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Digite o novo minuto (0-59): ");
                int m = Integer.parseInt(scanner.nextLine());
                setMin(m);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas números!");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage() + ". Tente novamente.");
            }
        }
        scanner.close();
    }

    public void setSeg() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            try {
                System.out.print("Digite o novo segundo (0-59): ");
                int s = Integer.parseInt(scanner.nextLine());
                setSeg(s);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Erro: Digite apenas números!");
            } catch (IllegalArgumentException e) {
                System.out.println("Erro: " + e.getMessage() + ". Tente novamente.");
            }
        }
        scanner.close(); 
    }

    public int getHor() {
        return hora;
    }

    public int getMin() {
        return min;
    }

    public int getSeg() {
        return seg;
    }

    public String getHora1() {
        return String.format("%02d:%02d:%02d", hora, min, seg);
    }

    public String getHora2() {
        int hora12 = hora;
        String periodo;
        
        if (hora == 0) {
            hora12 = 12;
            periodo = "AM";
        } else if (hora < 12) {
            periodo = "AM";
        } else if (hora == 12) {
            periodo = "PM";
        } else {
            hora12 = hora - 12;
            periodo = "PM";
        }
        
        return String.format("%02d:%02d:%02d %s", hora12, min, seg, periodo);
    }

    public int getSegundos() {
        return (hora * 3600) + (min * 60) + seg;
    }
}