// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.MecanumDrive;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  private static VictorSPX m_fl = new VictorSPX(1);
  private static VictorSPX m_fr = new VictorSPX(2);
  private static VictorSPX m_rl = new VictorSPX(3);
  private static VictorSPX m_rr = new VictorSPX(4);

  MecanumDrive drive;

  /** Creates a new ExampleSubsystem. */
  public Drivetrain() {
    m_fr.setInverted(true);
    m_rr.setInverted(true);

    drive = new MecanumDrive(m_fl, m_rl, m_fr, m_rr);
  }

  public void driveCartesian(double y,double x,double z,double throttle){
    drive.driveCartesian(y*throttle, x*throttle, z*throttle);
  }

  
}
