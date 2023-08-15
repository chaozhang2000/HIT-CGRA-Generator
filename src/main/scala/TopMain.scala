package top
import chisel3._
import chisel3.util._
import chisel3.stage.{ChiselGeneratorAnnotation,ChiselStage}
import chisel3.tester._
import chisel3.tester.RawTester.test
object TopMain extends App {
  (new ChiselStage).execute(args,
    Seq(ChiselGeneratorAnnotation(()=> new Crossbar(5,6,8)))
    )
  (new ChiselStage).execute(args,
    Seq(ChiselGeneratorAnnotation(()=> new utils.RegisterFile(2,32,32)))
    )
  (new ChiselStage).execute(args,
    Seq(ChiselGeneratorAnnotation(()=> new utils.Memutil(2,2,64,64,true)))
    )
}
