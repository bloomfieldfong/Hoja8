import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Principal {
	public static void main(String[] args) throws IOException{
		//Declaracion de un vector heap
		VectorHeap<Paciente> vector = new VectorHeap<>();
		//Leer el archivo txt
		BufferedReader tempTexto = new BufferedReader(new FileReader(new File("pacientes.txt")));
		String linea;
		
		//Corta el string que esta en el texto y agrega los pactientes al vector 
		while ((linea = tempTexto.readLine())!=null){
			String[] txtDiv = linea.split(", ");
			Paciente paciente = new Paciente();
			paciente.setPaciente(txtDiv[0], txtDiv[1], txtDiv[2]);
			vector.add(paciente);
		}
		
		//Imprime los pacientes en orden
		while(vector.size()!=0){
			System.out.println(vector.getFirst().getNombre()+ ", "+ vector.getFirst().getSintoma()+ ", "+ vector.getFirst().getCodigo());
			vector.remove();
		}
	}
}
