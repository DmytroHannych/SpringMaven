package com.example.SpringMaven;

import com.example.SpringMaven.Entity.Note;
import com.example.SpringMaven.Service.NoteService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMavenApplication {

	public static void main(String[] args) {
		Note note = new Note(1l,"Test","Testing");
		Note note1 = new Note(2l,"Test1","Testing111");
		Note note2 = new Note(3l,"Test2","Testing222");
		NoteService noteService = new NoteService();
	     noteService.add(note);
		 noteService.add(note1);
		 noteService.add(note2);
//		System.out.println("noteService.listAll() = " + noteService.listAll());
//		System.out.println("noteService.getById(2l) = " + noteService.getById(2l));
//         noteService.update(new Note(2l,"Testst","Success"));
		System.out.println("noteService.listAll() = " + noteService.listAll());
		noteService.deleteById(2l);
		System.out.println("noteService.listAll() = " + noteService.listAll());
	}

}
