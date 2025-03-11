public class MainAsignatura {
    public static void main(String[] args) {
        Asignatura poo = new Asignatura();
        poo.setNombre("Programacipn orientada a objetos");
        poo.setClave("AED-1286");
        poo.setCreditos(5);
        poo.setTeoricas(2);
        poo.setPracticas(3);

        System.out.println(poo);

        //Creando los objetos
        Computadora obj1Cop = new Computadora();
        Computadora obj2Cop = new Computadora();

        Profesionista objPro1 = new Profesionista();
        Profesionista objPro2 = new Profesionista();

        Balon objBalon1 = new Balon();
        Balon objBalon2 = new Balon();

        Manzana objManz1 = new Manzana();
        Manzana objManz2 = new Manzana();

        Boleto objBol1 = new Boleto();
        Boleto objBol2 = new Boleto();

        //Llenando los objetos
        obj1Cop.setPantalla("Amoled 4k");
        obj1Cop.setRaton("Raton gaming inalambrico");
        obj1Cop.setTipoTeclado("Teclado de membrana ultra suave");

        obj2Cop.setPantalla("IPS Full HD");
        obj2Cop.setRaton("Raton alambrioco con modificadrod de DPI");
        obj2Cop.setTipoTeclado("Teclado mecanico con RGB");

        objPro1.setCortePelo("Tapper fade");
        objPro1.setVocacion("Abogado");
        objPro1.setEquipoTrabajo("Computadora de escritorio gamer");
        objPro1.setIngresoMensual("Mocho money defendiendo a walter white");

        objPro2.setCortePelo("Mullet");
        objPro2.setEquipoTrabajo("Laptop gamer economica de temu");
        objPro2.setVocacion("Ingeniero en gestion empresarial");
        objPro2.setIngresoMensual("Poco dinero");

        objBalon1.setClaseBalon("Plastico de mala calidad");
        objBalon1.setCalidad("Mala");
        objBalon1.setMaterialFab("Cuero y plastico");

        objBalon2.setMaterialFab("Full made by plastice too");
        objBalon2.setCalidad("La mejor estetica y la mejor calidad, brazo de 35");
        objBalon2.setClaseBalon("Balon de plastico y caucho");

        objManz1.setTipoManz("Manzana golden");
        objManz1.setColor("Amarillo");
        objManz1.setDureza("Blanda");

        objManz2.setTipoManz("Manzana verde");
        objManz2.setColor("Verde");
        objManz2.setDureza("Moderada");

        objBol1.setTamaño("Chico");
        objBol1.setFechaExp("Mañana");
        objBol1.setSerieNum("123456");
        objBol1.setTipoPapel("Carton mojado");

        objBol2.setTamaño("Chiquitito");
        objBol2.setFechaExp("Pasado mañana");
        objBol2.setSerieNum("El numero de control de ethan");
        objBol2.setTipoPapel("Cartoncillo");
    }
}
