using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using BinaryGap;

namespace Codility.Test
{
    [TestClass]
    public class BinaryGapTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int result = s.solution(1041);
            Assert.AreEqual(5, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int result = s.solution(9);
            Assert.AreEqual(2, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int result = s.solution(529);
            Assert.AreEqual(4, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int result = s.solution(15);
            Assert.AreEqual(0, result);
        }
    }
}
