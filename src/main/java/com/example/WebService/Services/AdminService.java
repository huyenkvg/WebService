package com.example.WebService.Services;

import com.example.WebService.Dto_Huyen.AdminDto;
import com.example.WebService.Entity_BLX.Admin;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Service;
import com.example.WebService.Repositories_Mixed.AdminRepository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AdminService {
    @Autowired
    private AdminRepository repo;
    @Autowired
    private ModelMapper modelMapper;
    public List<AdminDto> listAllHuyen() {
        return (List<AdminDto>) repo.findAll().stream()
                .map(this::convertToDto)
                .collect(Collectors.toList());
    }
    public void delete(String id) {
        repo.deleteById(id);
    }

    public Optional<Admin> get(String id) {
        return repo.findById(id);
    }
    public void save(Admin ad) {
        repo.save(ad);
    }

    public void insert(String email, String cmnd, String hoten, String sdt) {
        repo.insert(email, cmnd, hoten, sdt);
    }

    public AdminDto convertToDto(Admin ad) {
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.LOOSE);
        AdminDto Dto = new AdminDto();
        Dto= modelMapper.map(ad, AdminDto.class);
        return Dto;
    }
    public Admin convertToEntity(AdminDto adDto) throws ParseException {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
        Admin ad = modelMapper.map(adDto, Admin.class);

        return ad;
    }

//================= NGAN YEN ============================================================
    public List<Admin> listAll() {
        return (List<Admin>) repo.findAll();
    }



}
