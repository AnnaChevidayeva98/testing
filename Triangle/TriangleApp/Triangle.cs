using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TriangleApp
{
    public class Triangle
    {
        public static bool IsTriangle(double storona1, double storona2, double storona3)
        {
            return (storona1 > 0 && storona2 > 0 && storona3 > 0 && (storona1 + storona2 >= storona3) && (storona1 + storona3 >= storona2) && (storona2 + storona3 >= storona1));
        }
    }
}
