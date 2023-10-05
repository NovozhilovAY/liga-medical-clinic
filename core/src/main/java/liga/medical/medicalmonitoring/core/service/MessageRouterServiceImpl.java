package liga.medical.medicalmonitoring.core.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import liga.medical.dto.MessageDto;
import liga.medical.dto.MessageType;
import liga.medical.medicalmonitoring.core.api.MessageRouterService;
import liga.medical.medicalmonitoring.core.api.MessageSenderService;
import liga.medical.medicalmonitoring.core.config.RabbitConfig;
import org.springframework.stereotype.Service;

@Service
public class MessageRouterServiceImpl implements MessageRouterService {
    private final ObjectMapper objectMapper;
    private final MessageSenderService messageSenderService;

    public MessageRouterServiceImpl(ObjectMapper objectMapper, MessageSenderService messageSenderService) {
        this.objectMapper = objectMapper;
        this.messageSenderService = messageSenderService;
    }

    @Override
    public void routeMessage(String message) {
        try {
            MessageDto messageDto = objectMapper.readValue(message, MessageDto.class);
            MessageType messageType = messageDto.getMessageType();
            switch (messageType) {
                case DAILY:
                    messageSenderService.sendMessage(messageDto, RabbitConfig.DAILY_QUEUE_NAME);
                    break;
                case ALERT:
                    messageSenderService.sendMessage(messageDto, RabbitConfig.ALERT_QUEUE_NAME);
                    break;
                case ERROR:
                    messageSenderService.sendMessage(messageDto, RabbitConfig.ERROR_QUEUE_NAME);
                    break;
                default:
                    return;
            }
        } catch (JsonProcessingException e) {
            System.out.println(e.getMessage());
        }
    }
}
