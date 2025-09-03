import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    private final TransactionRepository repo;

    public TransactionController(TransactionRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Transaction> getAll() { return repo.findAll(); }

    @PostMapping
    public Transaction add(@RequestBody Transaction tx) { return repo.save(tx); }
}
