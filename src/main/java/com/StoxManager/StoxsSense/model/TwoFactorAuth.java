package com.StoxManager.StoxsSense.model;


import com.StoxManager.StoxsSense.domain.VerificationType;
import lombok.Data;

@Data
public class TwoFactorAuth {
 private boolean  isEnabled=false;
 private VerificationType sendTo;
}
