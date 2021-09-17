package io.consortia.trial.webclient.rest;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvokeInputDTO {
    
    private String[] args;
    private Map<String, byte[]> transientMap;
  
}
