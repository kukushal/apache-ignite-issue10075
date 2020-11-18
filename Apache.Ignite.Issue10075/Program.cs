using Apache.Ignite.Core;
using System;

namespace Apache.Ignite.Issue10075
{
    class Program
    {
        static void Main(string[] args)
        {
            IgniteConfiguration CommonConfig(string name) => new IgniteConfiguration
            {
                IgniteInstanceName = name,
                SpringConfigUrl = "ignite-config.xml",
                JvmClasspath = "apache-ignite-issue10075-1.0.0-SNAPSHOT.jar"
            };

            var igniteServerCfg = CommonConfig("server1");

            var igniteAppCfg = CommonConfig("app");
            igniteAppCfg.ClientMode = true;

            using var _ = Ignition.Start(igniteServerCfg);
            using var ignite = Ignition.Start(igniteAppCfg);
            var calc = ignite.GetServices().GetServiceProxy<ICalculator>("IgniteCalculatorService");
            var res = calc.Calculate(new Parameter { Id = 2, Value = 2.0 });
            Console.WriteLine($">>>>> {res.Value}");
        }
    }
}
