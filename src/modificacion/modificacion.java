package modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.consola.ConsolaOlimpicos;
import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class modificacion {
	public static void main(String[] args) throws FileNotFoundException, IOException 
	{
		System.out.println("hola , mundo!");
		CalculadoraEstadisticas calc = LoaderOlimpicos.cargarArchivo("C:\\Users\\andre\\Desktop\\trabajops de diseno\\Taller0_Olimpicos\\data\\atletas.csv");
		System.out.println(calc.paisConMasMedallistas());
	}

}
