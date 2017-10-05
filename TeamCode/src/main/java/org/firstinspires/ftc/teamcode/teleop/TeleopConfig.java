package org.firstinspires.ftc.teamcode.teleop;

/**
 * Created by EvanCoulson on 9/26/17.
 */

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.util.config.ConfigParser;
import org.firstinspires.ftc.teamcode.robot.GearChain;


@TeleOp(name="TeleOpConfig", group="TeleOp")
public class TeleopConfig extends OpMode {
    private DcMotor motor;
    private GearChain gearChain;
    private final String CONFIG = "gears.omc";

    private ConfigParser c;
    public void init() {
        c = new ConfigParser(CONFIG);

    }

    public void loop() {

    }
}
