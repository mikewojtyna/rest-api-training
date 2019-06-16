package pl.strefakursow.restapi.maturity.methods;

import org.springframework.web.bind.annotation.*;
import pl.strefakursow.restapi.document.Document;
import pl.strefakursow.restapi.maturity.util.DataFixtureUtils;

import java.util.List;

@RestController("documentServiceL2")
@RequestMapping("/api/maturity/l2/documents")
public class DocumentService {
	private List<Document> documents =
		DataFixtureUtils.initDocuments();

	@GetMapping
	public List<Document> getAllDocuments() {
		return documents;
	}

	@PostMapping
	public void addDocument(@RequestBody Document document) {
		documents.add(document);
	}

	@DeleteMapping("/{number}")
	public void removeDocument(@PathVariable("number") long number) {
		documents.removeIf(document -> document
			.getNumber() == number);
	}
}
