package com.example.graphics;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.ActionEvent;
 import com.example.graphics.RandomArray;

public class Game  {

	private JFrame frame;
	
    JLabel[] jlabel = new JLabel[50];
    JLabel timerlabel= new JLabel();
    int secondsElapsed = 0;
   
    private int timerval = 0;
    private Timer timer;
    private TimerTask task;

    public int sec=0;
    public int min=0;
//    int sec1=10,min1=10;
//    String sec=String.format("%02d", sec1);
//    String min=String.format("%02d", min1);
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Game() {
		initialize();
		  
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
//		Border border = BorderFactory.createLineBorder(Color.BLACK, 1);
		frame = new JFrame();
		frame.setBounds(100, 100, 240, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		int i=1;
		jlabel[1]  = new JLabel("1");
//		lblNewLabel.setBorder(border);
		jlabel[1].setBounds(10, 10, 20, 13);
		frame.getContentPane().add(jlabel[1]);
		
		 jlabel[2] = new JLabel("2");
//		lblNewLabel2.setBorder(border);
		 jlabel[2].setBounds(40, 10, 20, 13);
		frame.getContentPane().add(jlabel[2]);
		
		
		jlabel[3] = new JLabel("3");
		jlabel[3].setBounds(70, 10, 20, 13);
//		jlabel[3].setBorder(border);		
		frame.getContentPane().add(jlabel[3]);
		
		jlabel[4] = new JLabel("4");
//		lblNewLabel_3.setBorder(border);
		
		jlabel[4] .setBounds(100, 10, 20, 13);
		frame.getContentPane().add(jlabel[4] );
		
		
		 jlabel[5] = new JLabel("5");
//		jlabel[5].setBorder(border);
		jlabel[5].setBounds(130, 10, 20, 13);
		frame.getContentPane().add(jlabel[5]);
		
		 jlabel[6] = new JLabel("6");
//		jlabel[].setBorder(border);
		jlabel[6].setBounds(160, 10, 20, 13);
		frame.getContentPane().add(jlabel[6]);
		
		 jlabel[7] = new JLabel("7");
//		jlabel[].setBorder(border);
		jlabel[7].setBounds(190, 10, 20, 13);
		frame.getContentPane().add(jlabel[7]);
		
		
		////Row 2
		 jlabel[8] = new JLabel("8");
		jlabel[8].setBounds(10, 40, 20, 13);
		frame.getContentPane().add(jlabel[8]);
		
		 jlabel[9] = new JLabel("9");
		jlabel[9].setBounds(40, 40, 20, 13);
		frame.getContentPane().add(jlabel[9]);
		
		 jlabel[10] = new JLabel("10");
		jlabel[10].setBounds(70, 40, 20, 13);
		frame.getContentPane().add(jlabel[10]);
		
		 jlabel[11] = new JLabel("11");
		jlabel[11].setBounds(100, 40, 20, 13);
		frame.getContentPane().add(jlabel[11]);
		
		 jlabel[12] = new JLabel("12");
		jlabel[12].setBounds(130, 40, 20, 13);
		frame.getContentPane().add(jlabel[12]);
		
		 jlabel[13] = new JLabel("13");
		jlabel[13].setBounds(160, 40, 20, 13);
		frame.getContentPane().add(jlabel[13]);
		
		 jlabel[14] = new JLabel("14");
		jlabel[14].setBounds(190, 40, 20, 13);
		frame.getContentPane().add(jlabel[14]);
		
		
		//row 3
		 jlabel[15] = new JLabel("15");
		jlabel[15].setBounds(10, 70, 20, 13);
		frame.getContentPane().add(jlabel[15]);
		
		 jlabel[16] = new JLabel("16");
		jlabel[16].setBounds(40, 70, 20, 13);
		frame.getContentPane().add(jlabel[16]);
		
		 jlabel[17] = new JLabel("17");
		jlabel[17].setBounds(70, 70, 20, 13);
		frame.getContentPane().add(jlabel[17]);
		
		 jlabel[18] = new JLabel("18");
		jlabel[18].setBounds(100, 70, 20, 13);
		frame.getContentPane().add(jlabel[18]);
		
		 jlabel[19] = new JLabel("19");
		jlabel[19].setBounds(130, 70, 20, 13);
		frame.getContentPane().add(jlabel[19]);
		
		 jlabel[20] = new JLabel("20");
		jlabel[20].setBounds(160, 70, 20, 13);
		frame.getContentPane().add(jlabel[20]);
		
		 jlabel[21] = new JLabel("21");
		jlabel[21].setBounds(190, 70, 20, 13);
		frame.getContentPane().add(jlabel[21]);
		
		
		//Row 4
		 jlabel[22] = new JLabel("22");
		jlabel[22].setBounds(10, 100, 20, 13);
		frame.getContentPane().add(jlabel[22]);
		
		 jlabel[23] = new JLabel("23");
		jlabel[23].setBounds(40, 100, 20, 13);
		frame.getContentPane().add(jlabel[23]);
		
		 jlabel[24] = new JLabel("24");
		jlabel[24].setBounds(70, 100, 20, 13);
		frame.getContentPane().add(jlabel[24]);
		
		 jlabel[25] = new JLabel("25");
		jlabel[25].setBounds(100, 100, 20, 13);
		frame.getContentPane().add(jlabel[25]);
		
		 jlabel[26] = new JLabel("26");
		jlabel[26].setBounds(130, 100, 20, 13);
		frame.getContentPane().add(jlabel[26]);
		
		 jlabel[27] = new JLabel("27");
		jlabel[27].setBounds(160, 100, 20, 13);
		frame.getContentPane().add(jlabel[27]);
		
		 jlabel[28] = new JLabel("28");
		jlabel[28].setBounds(190, 100, 20, 13);
		frame.getContentPane().add(jlabel[28]);
		
		
		
		//ROW 5
		 jlabel[29] = new JLabel("29");
		jlabel[29].setBounds(10, 130, 20, 13);
		frame.getContentPane().add(jlabel[29]);
		
		 jlabel[30] = new JLabel("30");
		jlabel[30].setBounds(40, 130, 20, 13);
		frame.getContentPane().add(jlabel[30]);
		
		 jlabel[31] = new JLabel("31");
		jlabel[31].setBounds(70, 130, 20, 13);
		frame.getContentPane().add(jlabel[31]);
		
		 jlabel[32] = new JLabel("32");
		jlabel[32].setBounds(100, 130, 20, 13);
		frame.getContentPane().add(jlabel[32]);
		
		 jlabel[33] = new JLabel("33");
		jlabel[33].setBounds(130, 130, 20, 13);
		frame.getContentPane().add(jlabel[33]);
		
		 jlabel[34] = new JLabel("34");
		jlabel[34].setBounds(160, 130, 20, 13);
		frame.getContentPane().add(jlabel[34]);
		
		 jlabel[35] = new JLabel("35");
		jlabel[35].setBounds(190, 130, 20, 13);
		frame.getContentPane().add(jlabel[35]);
		
		
		//ROW 6
		
		 jlabel[36] = new JLabel("36");
		jlabel[36].setBounds(10, 160, 20, 13);
		frame.getContentPane().add(jlabel[36]);
		
		
		
		 jlabel[37] = new JLabel("37");
		jlabel[37].setBounds(40, 160, 20, 13);
		frame.getContentPane().add(jlabel[37]);
		
		 jlabel[38] = new JLabel("38");
		jlabel[38].setBounds(70, 160, 20, 13);
		frame.getContentPane().add(jlabel[38]);
		
		 jlabel[39] = new JLabel("39");
		jlabel[39].setBounds(100, 160, 20, 13);
		frame.getContentPane().add(jlabel[39]);
		
		 jlabel[40] = new JLabel("40");
		jlabel[40].setBounds(130, 160, 20, 13);
		frame.getContentPane().add(jlabel[40]);
		
		 jlabel[41] = new JLabel("41");
		jlabel[41].setBounds(160, 160, 20, 13);
		frame.getContentPane().add(jlabel[41]);
		
		 jlabel[42] = new JLabel("42");
		jlabel[42].setBounds(190, 160, 20, 13);
		frame.getContentPane().add(jlabel[42]);
		
		
		//ROW 7
		 jlabel[43] = new JLabel("43");
		jlabel[43].setBounds(10, 190, 20, 13);
		frame.getContentPane().add(jlabel[43]);
		
		 jlabel[44] = new JLabel("44");
		jlabel[44].setBounds(40, 190, 20, 13);
		frame.getContentPane().add(jlabel[44]);
		
		 jlabel[45] = new JLabel("45");
		jlabel[45].setBounds(70, 190, 20, 13);
		frame.getContentPane().add(jlabel[45]);
		
		 jlabel[46] = new JLabel("46");
		jlabel[46].setBounds(100, 190, 20, 13);
		frame.getContentPane().add(jlabel[46]);
		
		 jlabel[47] = new JLabel("47");
		jlabel[47].setBounds(130, 190, 20, 13);
		frame.getContentPane().add(jlabel[47]);
		
		 jlabel[48] = new JLabel("48");
		jlabel[48].setBounds(160, 190, 20, 13);
		frame.getContentPane().add(jlabel[48]);
		
		 jlabel[49] = new JLabel("49");
		jlabel[49].setBounds(190, 190, 20, 13);
		frame.getContentPane().add(jlabel[49]);
		
		JButton btnNewButton = new JButton("shuffle");
		
		timerlabel = new JLabel("Timer: "+min+":"+sec);
		timerlabel.setBounds(105, 236, 98, 13);
		frame.getContentPane().add(timerlabel);
		timerlabel.setOpaque(false);
		
		
		 
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        Random random = new Random();                
		        int size = 49;
		        String[] array = new String[size];
		        
		        // Fill the array with numbers 1 to 49
		        for (int i = 0; i < size; i++) {
		            array[i] = String.valueOf(i + 1);
		        }
		        
		        shuffleArray(array);
		      
		        int a = 1;
		        for(int i = 0; i < size; i++) {                
		            Color randomColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));               
		                
		            System.out.print(array[i]);
		            System.out.print(" ");
		            
		            jlabel[a].setText(array[i]);
		            jlabel[a].setForeground(randomColor);
		            a++;
		        }
		        runTimer();
		    }
		});
		btnNewButton.setBounds(10, 232, 85, 21);
		frame.getContentPane().add(btnNewButton);
	}
		public void runTimer() {
		    if (timer != null) {
		        timer.cancel();
		    }
		    timer = new Timer();
		    timerval = 0;
		    min = 0;
		    sec = 0;
		    task = new TimerTask() {
		        @Override
		        public void run() {
//		            System.out.println("min " + min + ": sec " + sec);
		            timerval++;
		            sec = timerval;                
		            
		            if (timerval == 60) {
		                timerval = 0;
		                min = min + 1;
		            }
		            
		            timerlabel.setText("Timer: " + min + ":" + sec);
		            System.out.println();
		        }
		    };
		    timer.schedule(task, 0, 1000);
		}

	public static void shuffleArray(String[] array) {
        Random rand = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            // Swap array[i] with the element at random index
            String temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
