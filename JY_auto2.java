package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "JYDRIVE20194 (Blocks to Java)", group = "")
public class JYDRIVE20194 extends LinearOpMode {

  private DcMotor LeftDrive;

  /**
   * This function is executed when this Op Mode is selected from the Driver Station.
   */
  @Override
  public void runOpMode() {
    LeftDrive = hardwareMap.dcMotor.get("Left Drive");

    // Put initialization blocks here.
    waitForStart();
    if (opModeIsActive()) {
      while (opModeIsActive()) {
        // Put loop blocks here.
        if (gamepad1.left_stick_y < 0) {
          LeftDrive.setPower();
        } else if (false) {
        } else {
        }
      }
    }
  }
}
