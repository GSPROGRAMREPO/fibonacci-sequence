//Gavin Swiger
//October 7th 2020
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;


public class Fib_Seq extends Application{
	
	
	//Recursive Fibonacci Answer
	static int fib_recur(int user_input) {
	    if (user_input <= 1) 
	       return user_input;
	    return fib_recur(user_input-1) + fib_recur(user_input-2); 
    } 
	
	//Interative Fibonacci Answer
	private static int fib_iter(int user_input) {
		int n1 = 0;
		int n2 = 1;
		int n3;
		
		if (user_input == 0) {
			return n1;
		}
		for (int i = 2; i <= user_input; i++) {
			
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}
		return n2;
		
	}
	
	@Override public void start(Stage stage) {
        stage.setTitle("The Big Fib");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
         xAxis.setLabel("Nth Number in Sequence");
        final LineChart<String,Number> lineChart = 
                new LineChart<String,Number>(xAxis,yAxis);
       
        lineChart.setTitle("Gavin Swiger Fibonacci, 2020");
                          
        XYChart.Series series1 = new XYChart.Series();
        series1.setName("Recursive Runtime");

        for(int i = 1; i <= 42; i++) {
        	
            series1.getData().add(new XYChart.Data(Integer.toString(i), fib_recur(i)/20000));
        	
        }

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("Iterative Runtime");
        
        for(int j = 1; j <= 42; j++) {
        	
            series2.getData().add(new XYChart.Data(Integer.toString(j), fib_iter(j)));
        	
        }

        Scene scene  = new Scene(lineChart,800,600);       
        lineChart.getData().addAll(series2, series1);
       
       
        stage.setScene(scene);
        stage.show();
    }


	public static void main(String[] args) {
		
		launch(args);
		
	}



	
}
