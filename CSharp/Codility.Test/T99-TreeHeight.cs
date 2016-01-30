using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TreeHeight;

namespace Codility.Test
{
    [TestClass]
    public class TreeHeightTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            Tree T = null;
            int result = s.solution(T);
            Assert.AreEqual(-1, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            Tree T = new Tree { x = 5 };
            int result = s.solution(T);
            Assert.AreEqual(0, result);
        }


        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            Tree T = new Tree { x = 5 };
            Tree L1 = new Tree { x = 3 };
            Tree R1 = new Tree { x = 10 };
            Tree L2 = new Tree { x = 20 };
            Tree L3 = new Tree { x = 21 };
            Tree R2 = new Tree { x = 1 };
            T.l = L1;
            T.r = R1;
            L1.l = L2;
            L1.r = L3;
            R1.l = R2;
            int result = s.solution(T);
            Assert.AreEqual(2, result);
        }
    }
}
