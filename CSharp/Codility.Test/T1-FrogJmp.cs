using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FrogJmp;

namespace Codility.Test
{
    [TestClass]
    public class FrogJmpTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int result = s.solution(10, 85, 30);
            Assert.AreEqual(3, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int result = s.solution(10, 10, 30);
            Assert.AreEqual(0, result);
        }


        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int result = s.solution(10, 20, 10);
            Assert.AreEqual(1, result);
        }
    }
}
