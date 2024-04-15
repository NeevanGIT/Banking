package org.taskfile;

import java.util.ArrayList;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class Train {

  private String trainname;
  private int trainno;
  private String starting;
  private String ending;
 
	private ArrayList<String> destinations; 
	
	private ArrayList<Object> passengerDetail;
}
