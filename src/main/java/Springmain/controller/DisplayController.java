package Springmain.controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import Springmain.pojo.Display;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
@RestController
public class DisplayController {
List<Display> list;
@GetMapping("/display")
public List<Display> getInfo(){
        list=new ArrayList<>(Arrays.asList(new Display("1","kottai","21","male"),
        		           new Display("2","vijay","23","male"),
			               new Display("3","raj","26","male")));
		return list;
		
}
@GetMapping("/display/{id}")
public Display getperinfor(@PathVariable String id){
	return list.stream().filter(d -> d.getId().equals(id)).findFirst().get();
}
@RequestMapping(method=RequestMethod.POST,value="/display")
public void addData(@RequestBody Display display){
	System.out.println("the json data"+display);
	list.add(display);
}
//**************Update data******************
@RequestMapping(method=RequestMethod.PUT,value="/display/{id}")
public void update(@RequestBody Display display,@PathVariable String id){
	list.add(display);
	System.out.println("Successfully updated");
}

}
