using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Brackets;

namespace Codility.Test
{
    [TestClass]
    public class BracketsTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            String S = "";
            int result = s.solution(S);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            String S = "(";
            int result = s.solution(S);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            String S = ")";
            int result = s.solution(S);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            String S = "(}";
            int result = s.solution(S);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            String S = "{{}}{}[][]()()({[]})";
            int result = s.solution(S);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod6()
        {
            Solution s = new Solution();
            String S = "((({{{)))}}}";
            int result = s.solution(S);
            Assert.AreEqual(0, result);
        }
    }
}
