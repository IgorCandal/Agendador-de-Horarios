package com.candal.agendador_horarios.infrastructure.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.candal.agendador_horarios.infrastructure.entity.Agendamento;

import jakarta.transaction.Transactional;

import java.time.LocalDateTime;


public interface AgendamentoRepository extends JpaRepository<Agendamento, Long>{

    Agendamento findByServicoAndDataHoraAgendamentoBetween(String servico, LocalDateTime dataHoraInicio,
         LocalDateTime dataHoraFim);

    @Transactional
    void deleteByDataHoraAgendamentoAndCliente(LocalDateTime dataHoraAgendamento, String cliente);

    Agendamento findByDataHoraAgendamentoBetween(LocalDateTime dataHoraInicial, LocalDateTime dataHoraFinal);

    Agendamento findByDataHoraAgendamentoAndCliente(LocalDateTime dataHoraAgendamento, String cliente);


    
}
