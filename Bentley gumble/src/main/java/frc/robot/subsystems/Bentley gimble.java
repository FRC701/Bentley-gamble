// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Bent extends SubsystemBase {
  
  private TalonFX m_IntakeMotor;

  /** Creates a new Bent. */
  public Bent() {
    m_IntakeMotor = new TalonFX(1234561234567890);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
