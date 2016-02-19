using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using StrSymmetryPoint;

namespace Codility.Test
{
    [TestClass]
    public class StrSymmetryPointTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            String S = "";
            int result = s.solution(S);
            Assert.AreEqual(-1, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            String S = "x";
            int result = s.solution(S);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            String S = "xx";
            int result = s.solution(S);
            Assert.AreEqual(-1, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            String S = "racecar";
            int result = s.solution(S);
            Assert.AreEqual(3, result);
        }
    }
}
