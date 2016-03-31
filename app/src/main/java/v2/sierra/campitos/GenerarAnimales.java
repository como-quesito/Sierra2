package v2.sierra.campitos;

import java.util.ArrayList;

/**
 * Created by campitos on 19/01/16.
 */
public class GenerarAnimales {

    public static ArrayList<Reptil> obtenerReptiles(){
        ArrayList<Reptil> reptiles=new ArrayList<Reptil>();
        Reptil r1=new Reptil("Cara de Niño","Estos insectos viven la mayor parte de su vida bajo tierra, son benéficos, ya que ayudan al" +
                " crecimiento de las plantas al remover la tierra y evitar la erosión del suelo.  ","");
         r1.setDrawable(R.drawable.caradenino);
        Reptil r2=new Reptil("Catarina Mexicana","Reconocibles fácilmente por su pequeño tamaño, de cuerpo generalmente liso, color obscuro y con manchas amarillas, rojas o naranjas, pueden llegar a ser plaga, pero también" +
                " han sido usadas como controladores de otras especies en invernaderos como por ejemplo del pulgón verde.","");
        r2.setDrawable(R.drawable.catarina);
        Reptil r3=new Reptil("Chinche gigante","Son de distribución mundial se encuentran sobre todo en América Latina y Asia, llegan a medir hasta 2 cm o más. Se alimentan de especies más pequeñas. Estas chinches pueden consumirse en una gran diversidad de platillos típicos, entre ellos están las salsas, una de los tantos tipos de salsa es la tradicional del Valle del Mezquital donde el ingrediente " +
                "principal es la chinche del mezquite “Xamuis” (Thasus gigas) en combinación con el chile.","");
        r3.setDrawable(R.drawable.chinche);
        Reptil r4=new Reptil("Escarabajo de cactus","Negros, grandes, no voladores, propios de América del Norte en los desiertos al oeste de Estados Unidos y norte de México, se alimentan de cactus y tunas, pueden llegar a ser plagas de estas mismas" +
                " plantas y en ocasiones imitan a los “pinacates” eyectando una sustancia de olor desagradable.","");
        r4.setDrawable(R.drawable.escarabajacactus);

        Reptil r5=new Reptil("Escarabajo bombardero","Se caracterizan por ser capaces de lanzar un líquido corrosivo desde su abdomen a sus posibles atacantes el cual es acumulado en un compartimento en su abdomen, donde es calentado a altas temperaturas y consigue lanzarlo " +
                "a presión por sus cavidades corporales, sin llegar a ser mortal si puede generar irritación en la piel.","");
        r5.setDrawable(R.drawable.escarabajobombardero);

        Reptil r6=new Reptil("Escarabajo pelotero","Escarabajo muy conocido y peculiar por formar una bola de estiércol con sus patas delanteras, la cual es llevada a una galería en el suelo, utilizada para que la hembra coloque sus huevecillos. " +
                "Son importantes recicladores de materia orgánica y buenos nutrientes de suelos.","");
        r6.setDrawable(R.drawable.escarabajopelotero);

        Reptil r7=new Reptil("Grillo","Estos insectos pueden ser útiles como alimento " +
               "para otros animales, en este caso para mascotas como tarántulas y reptiles como iguanas, tortugas, etcétera.","");
        r7.setDrawable(R.drawable.grillo);

        Reptil r8=new Reptil("Chinche de monte o Jumil","Son originarias de América Latina, miden poco menos de 1 cm, las hembras miden un poco más, son especies que cuando se sienten agredidos despiden un fétido olor que aleja a sus atacantes, Este tipo de chinche puede ser utilizada en la gastronomía, ya que es una fuente muy elevada de proteína sin grasas, ya que poseen bajos niveles de colesterol, " +
                "además de tener también un alto porcentaje de yodo, el cual es necesario para las hormonas de la tiroides.","E");
        r8.setDrawable(R.drawable.jumil);

        reptiles.add(r1);
        reptiles.add(r2);
        reptiles.add(r3);
        reptiles.add(r4);
        reptiles.add(r5);
        reptiles.add(r6);
        reptiles.add(r7);
        reptiles.add(r8);
        return reptiles;
    }
}
