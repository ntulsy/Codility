using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MinPerimeterRectangle;

namespace Codility.Test
{
    [TestClass]
    public class MinPerimeterRectangleTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int result = s.solution(1);
            Assert.AreEqual(4, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int result = s.solution(25);
            Assert.AreEqual(20, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int result = s.solution(7);
            Assert.AreEqual(16, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int result = s.solution(40);
            Assert.AreEqual(26, result);
        }
    }
}
