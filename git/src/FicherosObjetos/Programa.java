package FicherosObjetos;

import javax.swing.JOptionPane;

public class Programa {
	public void menu() {
		System.out.println("1)Imprimir agenda");
		System.out.println("2) Añadir contacto");
		System.out.println("3) Eliminar contacto");
		System.out.println("4) Salir");
		System.out.println("Elige una opcion: ");
		
	}
	public static void main(String[] args) {
		boolean salir=false;
		int opcion;
		Programa p=new Programa();
		Agenda agenda=new Agenda();
		agenda.cargarAgenda("contactos.bin");
		String nombre="",direccion="", email="",telefono="";
		do {
			p.menu();
			opcion=Integer.parseInt(JOptionPane.showInputDialog("opcion"));
			switch(opcion) {
			
			case 1:
				agenda.imprimirAgenda();
				break;
			case 2: 
				nombre = JOptionPane.showInputDialog("nombre");
				direccion = JOptionPane.showInputDialog("direccion");
				email = JOptionPane.showInputDialog("email");
				telefono = JOptionPane.showInputDialog("telefono");
				agenda.addContacto(new Contacto(nombre,telefono,direccion,email));
				break;
			case 3:
				agenda.eliminarContacto(JOptionPane.showInputDialog("contacto"));
				break;
			case 4:salir=true;
				agenda.guardarAgenda("contactos.bin");
				break;
			}
			
		}while(!salir);
		

	}

}
