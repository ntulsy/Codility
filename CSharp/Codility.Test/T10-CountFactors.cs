using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CountFactors;

namespace Codility.Test
{
    [TestClass]
    public class CountFactorsTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int result = s.solution(1);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int result = s.solution(25);
            Assert.AreEqual(3, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int result = s.solution(7);
            Assert.AreEqual(2, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int result = s.solution(40);
            Assert.AreEqual(8, result);
        }
    }
}
