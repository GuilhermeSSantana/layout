package cadastro.pessoa.layout.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import cadastro.pessoa.layout.model.Task;
import cadastro.pessoa.layout.repository.TaskRepository;

@Controller
public class TaskController {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/create")
    public String home() {
        return "create";
    }

    @PostMapping("/create")
    public String create(Task task) {
        // Salvando a tarefa no banco de dados H2 usando o repositório JPA
        taskRepository.save(task);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public ModelAndView list() {
        ModelAndView mv = new ModelAndView("list");
        mv.addObject("tasks", taskRepository.findAll()); // Busca todas as tarefas no banco H2
        mv.setViewName("list");
        return mv;
    }
}