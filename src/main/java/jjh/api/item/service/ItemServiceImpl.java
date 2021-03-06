package jjh.api.item.service;

import jjh.api.item.domain.Item;
import jjh.api.item.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Service
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;


    @Override

    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @Override
    public Optional<Item> getById(long id) {
        return itemRepository.findById(id);
    }

    @Override
    public void save(Item item) {
        itemRepository.save(item);
    }

    @Override
    public boolean existsById(long id) {
        return itemRepository.existsById(id);
    }

    @Override
    public long count() {
        return itemRepository.count();
    }

    @Override
    public void deleteById(long id) {
        itemRepository.deleteById(id);
    }
}
