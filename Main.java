public class Main {
    public static void main(String args[]){
        // Fuente de Datos
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("C", 40);
        data.setValue("Java", 45);
        data.setValue("Python", 15);
 
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart(
         "Ejemplo Rapido de Grafico en un ChartFrame", 
         data, 
         true, 
         true, 
         false);
 
        // Mostrar Grafico
        ChartFrame frame = new ChartFrame("JFreeChart", chart);
        frame.pack();
        frame.setVisible(true);
    }
}

