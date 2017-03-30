import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Principal {
	public static void main(String[] args) throws IOException{
		VectorHeap<Paciente> vector = new VectorHeap<>();
		BufferedReader tempTexto = new BufferedReader(new FileReader(new File("pacientes.txt")));
		String linea;
		while ((linea = tempTexto.readLine())!=null){
			String[] txtDiv = linea.split(", ");
			Paciente paciente = new Paciente();
			paciente.setPaciente(txtDiv[0], txtDiv[1], txtDiv[2]);
			vector.add(paciente);
		}
		while(vector.size()!=0){
			System.out.println(vector.getFirst().getNombre()+ ", "+ vector.getFirst().getSintoma()+ ", "+ vector.getFirst().getCodigo());
			vector.remove();
		}
	}
}
