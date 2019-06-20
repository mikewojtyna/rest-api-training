package pl.strefakursow.restapi.document.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.strefakursow.restapi.document.Document;

import java.util.Collection;

public interface DocumentRepository extends JpaRepository<Document, Long> {
	Collection<Document> findByTitle(String title);
}
