using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CountDiv;

namespace Codility.Test
{
    [TestClass]
    public class CountDivTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int result = s.solution(0, 0, 10);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int result = s.solution(0, 9, 10);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int result = s.solution(0, 10, 10);
            Assert.AreEqual(2, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int result = s.solution(6, 11, 2);
            Assert.AreEqual(3, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int result = s.solution(6, 6, 6);
            Assert.AreEqual(1, result);
        }
    }
}
