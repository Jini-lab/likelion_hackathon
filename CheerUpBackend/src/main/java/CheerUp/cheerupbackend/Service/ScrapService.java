package CheerUp.cheerupbackend.Service;
import CheerUp.cheerupbackend.Entity.ButtonClick;
import CheerUp.cheerupbackend.Entity.Scrap;
import CheerUp.cheerupbackend.Repository.ButtonClickRepository;

import CheerUp.cheerupbackend.Repository.ScrapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ScrapService {
    private final ScrapRepository scrapRepository;

    @Autowired
    public ScrapService(ScrapRepository scrapRepository) {
        this.scrapRepository = scrapRepository;
    }

    public Iterable<Scrap> getAllScraps() {
        return scrapRepository.findAll();
    }
    public void saveScrap(Scrap scrap) {
        scrapRepository.save(scrap);
    }
}
