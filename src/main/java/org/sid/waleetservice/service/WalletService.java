package org.sid.waleetservice.service;

import org.sid.waleetservice.entities.Currency;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

@Service
@Transactional
public class WalletService {
    public void loadData() throws IOException {
        URI uri = new ClassPathResource("currency.data.csv").getURI();
        Path path = Paths.get(uri);
        Files.readAllLines(path);
        List<String> lines = Files.readAllLines(path);
        for (int i = 1; i < lines.size(); i++) {
            String[] line = lines.get(i).split(";");
            Currency currency = Currency.builder()
                    .code(line[0])
                    .name(line[1])
                    .symbol(line[2])
                    .salePrice(Double.parseDouble(line[3]))
                    .purchasePrice(Double.parseDouble(line[4]))
                    .build();

        }
    }
}
